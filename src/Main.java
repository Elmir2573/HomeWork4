import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
               System.out.println("Задача № 1");
        int age = 12;
        if (age >= 18){
            System.out.println("Если возраст человека равен " +age+ " то он совершеннолетний.");}
        else {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать.");}
        System.out.println("Задача № 2");
int airTemperature = 4;
if(airTemperature < 5){
    System.out.println("На улице " +airTemperature+ " градусов, нужно надеть шапку.");}
else {
    System.out.println("Mожно идти без шапки.");}
        System.out.println("Задача № 3");
int carSpeed = 52;
if(carSpeed > 60){
    System.out.println("Если скорость " +carSpeed+ " км/ч, то придется заплатить штраф");}
else{
    System.out.println("Mожно ездить спокойно");}
        System.out.println("Задача № 4");
int personsAge = 3;
if(personsAge>=2 && personsAge <=6){
            System.out.println("Если возраст человека равен " +personsAge+ ", то ему нужно ходить в детский сад");}
if(personsAge>=7 && personsAge <=17){
            System.out.println("Если возраст человека равен " +personsAge+ ", то ему нужно ходить в школу");}
if(personsAge>=18 && personsAge <=24){
            System.out.println("Если возраст человека равен " +personsAge+ ", то ему нужно ходить в университет");}
if(personsAge >24){
            System.out.println("Если возраст человека равен " +personsAge+ ", то ему нужно ходить на работу");}
        System.out.println("Задача № 5");
int childsAge = 16;
if (childsAge <5){
    System.out.println("Если возраст ребенка равен " +childsAge+ ", то ему нельзя кататься на аттракционе.");}
if (childsAge >=5 && childsAge <=14){
    System.out.println("Если возраст ребенка равен " +childsAge+ ", то ему можно кататься на аттракционе в сопровождении взрослого.");}
if (childsAge >14){
    System.out.println("Если возраст ребенка равен " +childsAge+ ", то ему можно кататься на аттракционе без сопровождения взрослого.");}
        System.out.println("Задача № 6");
int passenger =108;
if (passenger >=0 && passenger <60){
    System.out.println("В вагоне есть сидячие и стоячие места.");}
else if (passenger >=60 && passenger < 102){
            System.out.println("В вагоне есть стоячие места, но нет сидячих мест.");}
else {
            System.out.println("В вагоне нет свободных мест");}
        System.out.println("Задача № 7");
int one = 65;
int two = 118;
int three = 216;
if (one > two && one >three){
    System.out.println("Первое число больше остальных двух");}
else if (two > one && two > three){
    System.out.println("Второе число больше остальных двух");}
else {
    System.out.println("Третье число больше остальных двух");}
    }
}