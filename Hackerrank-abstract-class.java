
// A Java abstract class is a class that can't be instantiated. That means you cannot create new instances of an abstract class. It works as a base for subclasses. You should learn about Java Inheritance before attempting this challenge.

// https://www.hackerrank.com/challenges/java-abstract-class/problem


//Write MyBook class here

class MyBook extends Book{
    @Override
    void setTitle(String s){
        this.title = s;
    }
    @Override
    public String getTitle(){
        return title;
    }
}


