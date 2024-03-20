package com.itschool.homework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HomeRunChallenge13 {
    public static void main(String[] args) {
        // apelez metoda generateMaze si atribui rezultatul ei intr-o variabila de tip matrice
        String[][] maze = generateMaze();
        // verific rezultatul returnat de apelul functiei BFS
        if (BFS(maze)) {
            System.out.println("There is a a path from S to E");
        } else {
            System.out.println("No solutiion found");
        }
    }

    // metoda ce returneaza o matrice de siruri de caractere si o afiseaza
    public static String[][] generateMaze() {
        Scanner input = new Scanner(System.in);
        String[][] maze = new String[4][4];
        System.out.println("Please give the elements of the maze consisting by 0 and 1");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                maze[i][j] = input.nextLine();
                if (i == 0 && j == 0) {
                    maze[0][0] = "S";
                }
                if (i == 3 && j == 3) {
                    maze[3][3] = "E";
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(maze[i][j] + "\t");
            }
            System.out.println();
        }
        return maze;
    }

    // metoda care accepta o matrice de siruri de caractere String ca parametru
    // si returneaza o valoare booleana
    public static boolean BFS(String[][] maze) {
        int n = maze.length;
        // se creeaza o matrice de valori booleane pentru a tine evidenta nodurilor vizitate in labirint
        boolean[][] visited = new boolean[n][n];
        // nu inteleg atat de bine linia de mai jos
        Queue<int[]> queue = new LinkedList<>();

        // gasește pozitia de start
        // variabila start este un tablou de doua elemente care contine coordonatele x,y
        int[] start = findStart(maze);

        // adauga coordonatele nodului de start in coada pentru explorare
        queue.add(start);
        // marcheaza nodul de start ca fiind vizitat in timpul parcurgerii
        // evita sa explorez acelaso nod de mai multe ori
        visited[start[0]][start[1]] = true;

        // se ruleaza atat timp cat coada queue nu este goala
        while (!queue.isEmpty()) {
            // extrage si inlatura primul element din coada queue si il atribuie variabilei current
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            // daca am ajuns la punctul de sfarsit E return true
            if (maze[x][y].equals("E")) {
                return true;
            }

            // verific vecinii
            int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];
                // verific daca poziția vecinului este valida si nu a fost vizitata si nu este zid
                if (isValid(newX, newY, n) && !visited[newX][newY] && !maze[newX][newY].equals("1")) {
                    queue.add(new int[]{newX, newY});
                    visited[newX][newY] = true;
                }
            }
        }
        // daca nu am gasit un drum catre E return false
        return false;
    }
    private static int[] findStart(String[][] maze) {
        int[] start = new int[2];
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j].equals("S")) {
                    start[0] = i;
                    start[1] = j;
                    return start;
                }
            }
        }
        return start;
    }

    //se verifica daca coordonatele x y sunt in limitele matricei evitand erori de accesare de pozitii invalide
    private static boolean isValid(int x, int y, int n) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }
}
