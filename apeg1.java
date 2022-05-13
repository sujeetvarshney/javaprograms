import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class apeg1 extends Applet implements MouseListener,MouseMotionListener
{

	
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void paint(Graphics g)
	{
		
	}

	public void mouseClicked(MouseEvent me)
	{

		
	}
	
	public void mouseEntered(MouseEvent me)
	{
		setBackground(Color.RED);		
	}

	public void mouseExited(MouseEvent me)
	{
				setBackground(Color.GREEN);
		showStatus("Mouse is exitted at:"+me.getX()+","+me.getY());		
	}

	public void mousePressed(MouseEvent me)
	{
	}

	public void mouseReleased(MouseEvent me)
	{

	
	}

	public void mouseMoved(MouseEvent  me)
	{

		showStatus("Mouse is moving at:"+me.getX()+","+me.getY());		
	}

	
	public void mouseDragged(MouseEvent  me)
	{

		
	}
	
}


//<applet code=apeg1 width=300 height=400></applet>
