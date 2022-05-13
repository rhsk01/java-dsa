package com.company;

public class This_keyword {
    int i  ;
    void setvalues(int i){
//      i = x;// but if we'll provide same name as i it will print 0 so to resolv this issue we use this keyword
        this.i = i;
    }
    void show(){
        System.out.println(i);
    }
}
class xyz{
    public static void main(String[] args) {
        This_keyword t = new This_keyword();
        t.setvalues(10);
        t.show();
    }
}
