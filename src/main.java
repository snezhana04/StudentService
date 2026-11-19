import java.util.Scanner;
import java.util.InputMismatchException;


static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int phys = 0;
        int eng = 0;
        int math = 0;
        String name = null;
        String surname = null;
        String group = null;
        boolean input = true;
        while (input) {
            try {
                System.out.printf("Приветсвую вас! Введите ваши данные:%n Имя:%n");
                name = in.next();
                System.out.println("Фамилия:");
                surname = in.next();
                System.out.println("Возраст:");
                int old = in.nextInt();
                System.out.println("Группа:");
                group = in.next();
                System.out.println("Оценка по предмету математика:");
                math = in.nextInt();
                System.out.println("Оценка по предмету английский:");
                eng = in.nextInt();
                System.out.println("Оценка по предмету физика:");
                phys = in.nextInt();
                if (math>=2 && math<=5 && eng>=2 && eng<=5 && phys>=2 && phys<=5)
                {
                    input= false;
                } else {
                    System.out.println("Оценка должка быть от 2 до 5!");
                }

            } catch (InputMismatchException e) {
                in.next();
                System.out.println("Введены некорректные данные");
            }
        }
        in.close();
        double middle = (math + eng + phys) / 3.0;
        System.out.printf("Средний балл %s %s из группы %s составляет %f", name, surname, group, middle);
    }

