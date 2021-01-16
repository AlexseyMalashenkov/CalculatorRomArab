package converter;

import java.util.InputMismatchException;

public class Convert {
    private boolean isRom = false;

    public boolean isRom() {
        return isRom;
    }

    public int convert(String num) {
        int out;

        switch (num) {
            case "1":
                out = 1;
                this.isRom = false;
                break;
            case "I":
                out = 1;
                this.isRom = true;
                break;
            case "2":
                out = 2;
                this.isRom = false;
                break;
            case "II":
                out = 2;
                this.isRom = true;
                break;
            case "3":
                out = 3;
                this.isRom = false;
                break;
            case "III":
                out = 3;
                this.isRom = true;
                break;
            case "4":
                out = 4;
                this.isRom = false;
                break;
            case "IV":
                out = 4;
                this.isRom = true;
                break;
            case "5":
                out = 5;
                this.isRom = false;
                break;
            case "V":
                out = 5;
                this.isRom = true;
                break;
            case "6":
                out = 6;
                this.isRom = false;
                break;
            case "VI":
                out = 6;
                this.isRom = true;
                break;
            case "7":
                out = 7;
                this.isRom = false;
                break;
            case "VII":
                out = 7;
                this.isRom = true;
                break;
            case "8":
                out = 8;
                this.isRom = false;
                break;
            case "VIII":
                out = 8;
                this.isRom = true;
                break;
            case "9":
                out = 9;
                this.isRom = false;
                break;
            case "IX":
                out = 9;
                this.isRom = true;
                break;
            case "10":
                out = 10;
                this.isRom = false;
                break;
            case "X":
                out = 10;
                this.isRom = true;
                break;
            default:
                throw new InputMismatchException("Ошибка ввода");

        }

        return out;
    }

    public String arabicToRoman(int number) {
        if ((number <= 0) || (number > 100)) {
            throw new IllegalArgumentException(number + " некорректное число.");
        }

        ArabToRom arabToRom = new ArabToRom();

        return arabToRom.toRoman(number);
    }
}
