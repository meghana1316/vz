import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class DC {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Digital Clock");
        JLabel timeLabel = new JLabel();
        
        timeLabel.setFont(new Font("SansSerif", Font.PLAIN, 48));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(timeLabel);
        
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String currentTime = sdf.format(new Date());
                timeLabel.setText(currentTime);
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000); 
    }
}
