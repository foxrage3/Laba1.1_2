import java.util.Scanner;

class Sotrudnik {
    String fam, im, otch, doljnost, childrens;
    int countChildrens;
}
class Children {
    String name;
    int age;
}

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во сотрудников");
        int count = sc.nextInt();
        sc.nextLine();
        Sotrudnik[] sotr = new Sotrudnik[count];

        for ( int i = 0; i < count; i++){
            System.out.println("Введите информацию о " + (i + 1) + "сотруднике");
            sotr[i] = new Sotrudnik();
            System.out.println("Введите фамилию");
            sotr[i].fam = sc.nextLine();
            System.out.println("Введите имя");
            sotr[i].im = sc.nextLine();
            System.out.println("Введите отчество");
            sotr[i].otch = sc.nextLine();
            System.out.println("Введите должность");
            sotr[i].doljnost = sc.nextLine();
            System.out.println("Введите количество детей");
            sotr[i].countChildrens = sc.nextInt();
            sc.nextLine();
            if(sotr[i].countChildrens!=0) {
                sotr[i].childrens = new Children[sotr[i].countChildrens];
                for (int j = 0; j < sotr[i].countChildrens; j++) {
                    sotr[i].childrens[j] = new Children();
                    System.out.println("Введите имя" + (j + 1) + "ребенка");
                    sotr[i].childrens[j].name = sc.nextLine();
                    System.out.println("Введите возраст" + (j + 1) + "ребенка");
                    sotr[i].childrens[j].age = sc.nextInt();
                    sc.nextLine();
                }
            }
        }

        System.out.println("\n Сотрудник фирмы: \n фам \t имя \t отч \t должность \t количество детей");
        for (Sotrudnik s:sotr){
            System.out.print(s.fam+ "\t"+s.im + "\t"+s.otch + "\t"+s.doljnost + "\t"+s.countChildrens + "\n");
            if(s.countChildrens!=0){
                System.out.println("Дети: ");
                for (int i = 0; i < s.countChildrens; i++){
                    System.out.println(s.childrens[i].name + "" + s.childrens[i].age);
                }
            }
        }
    }
}

