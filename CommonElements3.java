package com.company;

import java.util.ArrayList;

public class CommonElements3 {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6,7};
        int[] b = {2, 4, 6,7, 8, 9};
        int[] c = {2, 7, 9};

        int x = 0, y = 0, z = 0; // these are idx values for a,b,c
        ArrayList<Integer> al = new ArrayList();
        while (x < a.length && y < b.length && z < c.length) {
            if (a[x] == b[y] && b[y] == c[z]) {
                al.add(a[x]);
                x++;
                y++;
                z++;
            } else if (a[x] < b[y]) { //< can be replaced by !=
                x++;
            } else if (b[y] < c[z]) {
                y++;
            } else {
                z++;
            }
        }
            for (int no : al) {
                System.out.print(no + " ");

            }
        }
    }
