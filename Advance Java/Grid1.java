import java.awt.*;
import java.applet.*;
/* <applet code="Grid1.class" width=400 height=200></applet>*/
public class Grid1 extends Applet
{
    final int n=4;
    public void init()
    {
        setLayout(new GridLayout(n,n));
        for(int i=1;i<=n*n;i++)
        {
            add(new Button("Button:"+i));
        }
    }
}