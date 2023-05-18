package main.java.com.AllanTeone.javacore.chapter13;

import java.awt.*;
import java.applet.*;
/*
<applet code="SimpleApplet" width=200 height=60>
</applet>
*/

public class SimpleApplet {
    public void paint(Graphics g) {
        g.drawString("Простейший апплет", 20, 20);
    }
}
