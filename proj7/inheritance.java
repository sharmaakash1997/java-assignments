class Parent
{
int x;
public void set x(int x)
{
this.x=x;
}
public void display()
{
system.out.println(x);
}
class child extends parent
{
int x;
public void set x(int x)
{
this.x=x;
}
class demo
{
public static void main(String args[])
{
child ch=new child();
ch.setx(10);
ch.display();
}
}

