package ninja.nosheep.client;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.Buffer;

/**
 * Created by Johan on 2016-04-13.
 */
public class Patcher extends JFrame {

    private boolean finished = false;
    private BufferedImage bg = null;

    public Patcher(){
        setTitle("Patcher");
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setFocusable(true);
        requestFocus();
        setVisible(true);

        try {
            bg = ImageIO.read(new File("assets/patcher/patcherbg.png"));
        } catch (Exception e) {
        }

        loop();
    }

    private void loop(){
        while(true){
            update();
            repaint();
            try{ Thread.sleep(17); }
            catch(Exception ex){ System.out.println("sleep interrupted"); }
        }
    }

    private void update(){}

    public void render(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0,0,getWidth(),getHeight());

        g.drawImage(bg, 0, 0, getWidth(), getHeight(), null);
    }

    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        Image screen = createImage(WIDTH, HEIGHT);
        g = getGraphics();
        render(screen.getGraphics());

        g.drawImage(screen, 0, 0, getWidth(), getHeight(), null);
        g.dispose();
    }

    public boolean isFinished(){
        if(finished)
            return true;
        return false;
    }

}
