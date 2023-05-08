class MainProgram {

    //Attribute
    private static boolean withNegatives;
    private static int maxAbsolute;

    //Deklaration
    private static int[] numbers;

    public static void main(String[] args) {
        withNegatives = true;
        maxAbsolute = 100;
        numbers = new int[10];
        fillArray(numbers, withNegatives, maxAbsolute);
        numbers = new int[]{0, 1, 2, 4, 2, 1, 0};
        numbers = increaseArray(numbers,1);
        showArray(numbers);

        //Hier sehen Sie Beispiele, wie man Methoden mit Rückgabewert aufrufen und dank der Systemkonsole testen kann.
        //Bevor die Methoden umgesetzt sind, werden sie nur 0 zurückgeben.
        System.out.println("Summe aller Zahlen im Array: " + sumUp(numbers));
        System.out.println("In diesem Array gibt es " + countNegatives(numbers) + " negative Zahlen.");
        System.out.println("Summe der negativen Zahlen: " + sumUpNegatives(numbers));
        System.out.println("Höhste Zahl: " + findMaximum(numbers) + " mit dem Index: " + findMaximumIndex(numbers));
        System.out.println("Sortiert?: " + isSorted(numbers));
        System.out.println("Palindrom?: " + checkArray(numbers));
    }

    private static void fillArray(int[] array, boolean wN, int maxA) {
        if (wN) {
            for (int i = 0; i < array.length; i++) {
                int power = (int) (Math.random() * 2);
                array[i] = (int) (Math.pow(-1, power) * (Math.random() * (maxA + 1)));
            }
        } else {
            for (int i = 0; i < numbers.length; i++) {
                array[i] = (int) (Math.random() * (maxA + 1));
            }
        }
    }

    /**
     * Diese Methode stellt alle Werte des übergeben Arrays samt dazugehörigem Index in der Systemkonsole dar.
     *
     * @param array
     */
    private static void showArray(int[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Index: " + i + " --- Zahl: " + array[i]);
            }
        }
    }


    /**
     * 1. Alle Werte aufaddieren
     * Schreiben Sie eine Methode sumUp, die als Parameter ein Array des Typs int übergeben bekommt. Die Methode sumUp soll die enthaltenen Zahlen addieren und das Ergebnis zurückliefern.
     *
     * @param array
     * @return Summe aller Zahlen im Array
     */
    private static int sumUp(int[] array) {
        int result = 0;
        //Hier muss Quellcode ergänzt werden.
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }


    /**
     * 2. Negative Werte zählen - hierzu bitte in Zeile 11 withNegatives = true setzen.
     * Schreiben Sie eine Methode countNegatives, die als Parameter ein Array des Typs int übergeben bekommt. Die Methode countNegatives soll die negativen Werte in diesem Array zählen und das Ergebnis als zurückgeben.
     *
     * @param array
     * @return Anzahl der negativen Zahlen im Array
     */
    private static int countNegatives(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                result++;
            }
        }
        return result;
    }


    /**
     * 3. Negative Werte aufsummieren
     * Schreiben Sie eine Methode sumUpNegatives, die als Parameter ein Array des Typs int übergeben bekommt. Die Methode sumUpNegatives soll die Summe der negativen Werte in diesem Array zurückgeben.
     *
     * @param array
     * @return Summe aller negativen Zahlen im Array
     */
    private static int sumUpNegatives(int[] array) {
        int result = 0;
        //Hier muss Quellcode ergänzt werden.
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                result += array[i];
            }
        }
        return result;
    }


    /**
     * 4. Bestimmen des Maximums in einem Feld
     * Schreiben Sie eine Methode findMaximum, die ein Array des Typs int als Parameter
     * übergeben bekommt und die den größten Wert in diesem Array zurückgibt.
     * Tipp: Versuchen Sie, mit einem Durchlauf durch das Array zu kommen.
     */
    private static int findMaximum(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    /**
     * 5. Bestimmen des Index des Maximums in einem Feld
     * Schreiben Sie eine Methode findMaximumIndex, die ein Array des Typs int als Parameter
     * übergeben bekommt und die den Index des größten Werts in diesem Array zurückgibt.
     * Tipp: Versuchen Sie, mit einem Durchlauf durch das Array zu kommen.
     */
    private static int findMaximumIndex(int[] array) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }


    /**
     * 6. Bestimmen der Häufigkeit des Maximums in einem Feld
     * Schreiben Sie eine Methode countMaximum, die ein Array des Typs int als Parameter
     * übergeben bekommt und die Häufigkeit der größten Zahl in diesem Array zurückgibt.
     */
    private static int countMaximum(int[] array) {
        int max = findMaximum(array);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                count++;
            }
        }
        return count;
    }


    /**
     * 7. Sortierung prüfen
     * Schreiben Sie eine Methode isSorted, die als Parameter ein Array des Typs int
     * übergeben bekommt. Die Methode isSorted soll true zurückgeben, falls die im Array enthaltenen Werte aufsteigend sortiert sind.
     * Sonst soll false zurückgegeben werden.
     */
    private static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }


    /**
     * 8. Palindrome
     * Ein Palindrom ist eine Folge von int-Werten, die vorwärts und rückwärts identisch gelesen werden kann.
     * Beispiele: 12 34 78 34 12 oder 5 17 85 85 17 5
     * Schreiben Sie eine Methode checkArray, die ein Array des Typs int übergeben bekommt und überprüft,
     * ob es sich bei dem Array um ein Palindrom handelt.
     * Die Methode soll einen Wert des Typs boolean zurückgeben.
     */
    private static boolean checkArray(int[] array) {
        for (int i = 0; i < array.length /2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return false;
            }
        }
        return true;
    }


    /** 9. Erhöhen der Inhalte eines Feldes
     * Schreiben Sie eine Methode increaseArray, die als Parameter ein Array des Typs int und einen int-Wert erhält.
     * Die Methode increaseArray soll alle Werte des Arrays um den im zweiten Parameter übergebenen Wert erhöhen und als neues Array zurückgeben.
     * Beispiel: Werden ein Array mit den Elementen 80,7,1,56,11,72,43,37 als erstes und der Wert 17 als zweites Argument übergeben,
     * so soll ein neues(!) Array mit den Werten 97,24,18,73,28,89,60,54 zurückgegeben werden.
     */

    private static int[] increaseArray(int[] array,int amount) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            result[i] = array[i] + amount;
        }
        return result;
    }
}
