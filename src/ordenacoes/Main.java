package ordenacoes;

public class Main {
    public static void main(String[] args) {
        int[] vetor1= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        // --- VETOR 1 (aleatório) ---
        System.out.println("--- VETOR 1 (aleatório) ---");
        ResultadoOrdenacao bubble1 = Ordenadores.bubbleSort(vetor1.clone());
        System.out.println("Bubble Sort: " + bubble1);
        ResultadoOrdenacao selection1 = Ordenadores.selectionSort(vetor1.clone());
        System.out.println("Selection Sort: " + selection1);
        ResultadoOrdenacao cocktail1 = Ordenadores.cocktailSort(vetor1.clone());
        System.out.println("Cocktail Sort: " + cocktail1);
        ResultadoOrdenacao gnome1 = Ordenadores.gnomeSort(vetor1.clone());
        System.out.println("Gnome Sort: " + gnome1);
        ResultadoOrdenacao comb1 = Ordenadores.combSort(vetor1.clone());
        System.out.println("Comb Sort: " + comb1);
        ResultadoOrdenacao bucket1 = Ordenadores.bucketSort(vetor1.clone());
        System.out.println("Bucket Sort: " + bucket1);
        System.out.println();

        // --- VETOR 2 (ordenado) ---
        System.out.println("--- VETOR 2 (ordenado) ---");
        ResultadoOrdenacao bubble2 = Ordenadores.bubbleSort(vetor2.clone());
        System.out.println("Bubble Sort: " + bubble2);
        ResultadoOrdenacao selection2 = Ordenadores.selectionSort(vetor2.clone());
        System.out.println("Selection Sort: " + selection2);
        ResultadoOrdenacao cocktail2 = Ordenadores.cocktailSort(vetor2.clone());
        System.out.println("Cocktail Sort: " + cocktail2);
        ResultadoOrdenacao gnome2 = Ordenadores.gnomeSort(vetor2.clone());
        System.out.println("Gnome Sort: " + gnome2);
        ResultadoOrdenacao comb2 = Ordenadores.combSort(vetor2.clone());
        System.out.println("Comb Sort: " + comb2);
        ResultadoOrdenacao bucket2 = Ordenadores.bucketSort(vetor2.clone());
        System.out.println("Bucket Sort: " + bucket2);
        System.out.println();

        // --- VETOR 3 (invertido) ---
        System.out.println("--- VETOR 3 (invertido) ---");
        ResultadoOrdenacao bubble3 = Ordenadores.bubbleSort(vetor3.clone());
        System.out.println("Bubble Sort: " + bubble3);
        ResultadoOrdenacao selection3 = Ordenadores.selectionSort(vetor3.clone());
        System.out.println("Selection Sort: " + selection3);
        ResultadoOrdenacao cocktail3 = Ordenadores.cocktailSort(vetor3.clone());
        System.out.println("Cocktail Sort: " + cocktail3);
        ResultadoOrdenacao gnome3 = Ordenadores.gnomeSort(vetor3.clone());
        System.out.println("Gnome Sort: " + gnome3);
        ResultadoOrdenacao comb3 = Ordenadores.combSort(vetor3.clone());
        System.out.println("Comb Sort: " + comb3);
        ResultadoOrdenacao bucket3 = Ordenadores.bucketSort(vetor3.clone());
        System.out.println("Bucket Sort: " + bucket3);
    }
}
