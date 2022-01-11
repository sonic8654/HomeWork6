package ru.geekbrain.com;

public abstract class Animal {
    //Инициализация переменных
    private int runMaxDistanse; //Дистанция бега
    private int swimMaxDistance; // Дистанция плаванья
    private int jumpMaxDistance; // Дистанция прыжка
    //Конструктор
 public Animal(int runMaxDistanse, int swimMaxDistance, float jumpMaxDistance){
     this.runMaxDistanse = runMaxDistanse;
     this.swimMaxDistance = swimMaxDistance;
     this.jumpMaxDistance = jumpMaxDistance;
 }
 // Прописываю виды поведения, параметры поведения каждого класса животных прописаны в отдельно созданых классах
 public void run(int runDistance){//Побежали
     System.out.println("run: " + (runDistance <= runMaxDistanse));

 }
 public void swim(int swimDistance){ //Поплыли
     System.out.println("swim: " + (swimDistance <= swimMaxDistance));
 }
 public void jump(int jumpHeight){ //Прыгаем
     System.out.println("jump: " + (jumpHeight <= jumpMaxDistance));
 }

}
