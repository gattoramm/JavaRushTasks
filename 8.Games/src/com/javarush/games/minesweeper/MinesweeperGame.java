package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

public class MinesweeperGame extends Game {

    private int width;
    private int height;

    @Override
    public void initialize() {
        /*
        //  Создаем игровое поле
        setScreenSize(10, 10);
        //  Включаем отображение сетки
        showGrid(true);
        //  Меняем фон центральной клетки на синий, и отображаем в ней “Х”
        setCellValueEx(1, 1, Color.BLUE, "X", Color.ORANGE, 50);

        //          5. Работа с клетками игрового поля
        // устанавливаем клетке с координатами (x, y) цвет color
        setCellColor(0, 0, Color.RED);
        setCellColor(3, 6, Color.BLACK);
        setCellColor(6, 8, Color.NONE);

        //  возвращает цвет клетки с координатами (x, y):
        Color myColor = getCellColor(2, 0);

        // помещаем в клетку с координатами (x, y) текст value
        setCellValue(3, 3, "text");
        setCellValue(0, 8, "W");
        setCellValue(4, 1, "2222");
        setCellValue(6, 6, "");

        // возвращает текст, содержащийся в клетке с координатами (x, y):
        String s = getCellValue(3, 3);
        System.out.println(getCellValue(4, 1));

        // устанавливает размер контента в клетке с координатами (x, y).
        setCellTextSize(2 , 0, 70); //  70% высоты клетки

        // возвращает размер контента в клетке с координатами (x, y):
        int size = getCellTextSize(2 , 0);

        // помещает в клетку с координатами (x, y) число value:
        setCellNumber(3, 3, 40);
        setCellNumber(0, 8, -8);
        setCellNumber(4, 1, 2222);
        setCellNumber(6, 6, 0);

        // возвращает число, содержащееся в клетке с координатами (x, y). Если в клетке содержится не число, возвращает 0
        int i = getCellNumber(3, 3);
        System.out.println(getCellNumber(4, 1));

        // устанавливает цвет контента(текста) в клетке с координатами (x, y):
        setCellTextColor(2, 1, Color.GREEN);
        setCellTextColor(0, 1, Color.NONE);

        // возвращает цвет контента (текста) в клетке с координатами (x, y):
        Color textColor = getCellTextColor(1, 3);

        // устанавливает клетке с координатами (x, y) цвет фона cellColor и контент value:
        setCellValueEx(0, 2, Color.BLUE, "56");

        //устанавливает клетке с координатами (x, y) цвет фона cellColor, контент value и цвет контента textColor:
        setCellValueEx(0, 2, Color.BLACK, "56", Color.GREEN);

        // устанавливает клетке с координатами (x, y) цвет фона cellColor, контент value, цвет контента textColor и размер контента textSize:
        setCellValueEx(0, 2, Color.BLACK, "56", Color.GREEN, 70);

        //          6. Работа с цветом
        Color mColor = Color.WHITE;  //  переменной myColor присваивается белый цвет.
        Color redColor = Color.RED; //  переменной redColor присваивается красный цвет.
        Color blueColor = Color.BLUE; //  переменной blueColor присваивается синий цвет.

        //  переменной colors присваивается массив, содержащий все доступные цвета.
        Color[] colors = Color.values();

        Color color = Color.RED;
        int redIndex = color.ordinal(); //  Номер красного цвета
        int blueIndex = Color.BLUE.ordinal(); //  Номер синего цвета

        //  переменной color присваивается цвет с индексом 10 из enum Color.
        Color color2 = Color.values()[10];

        //              7. Диалоговые окна

         // В конце игры игроку нужно сообщить о победе или поражении.
         // Для этого есть специальный метод, который выводит диалоговое окно на игровой экран:

        //void showMessageDialog(Color cellColor, String message, Color textColor, int textSize)

        //              8. Утилитные методы
        //int getRandomNumber(int max) — возвращает случайное целое число от 0 до (max–1) включительно.

        //int getRandomNumber(int min, int max) — возвращает случайное целое число от min до (max–1) включительно.

        //              9. Ограничения игрового движка

        */
    }

}
