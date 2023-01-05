import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] MyTovar = {{"Kola", "15"}, {"Sprite", "20"}, {"Fanta", "25"}};
        System.out.println("Рады приветствовать Вас в нашем магазине");
        int i = 0;
        while (i < MyTovar.length) {
            System.out.println(MyTovar[i][0] + " " + i);
            i++;
        }
        System.out.println("Выберите нужный Вам товар, введя цифру");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num > MyTovar.length) {
            System.out.println("Извините, этого товара нет в списке");
        } else {
            System.out.println(MyTovar[num][0] + " " + MyTovar[num][1] + " Поздравляем Вы сделали эту покупку");
        }
    }
}




