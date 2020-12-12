/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstbot;
import robocode.AdvancedRobot;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;
import robocode.HitRobotEvent;
/**
 *
 * @author edmsvche
 */
public class MyFirstBot extends AdvancedRobot {
    double randHit = 1;
    int backDir = 1;
	
	public void run() {
		while (true) {
			setTurnRight(10000);
			setMaxVelocity(5);
			ahead(10000);
		}
	}
 

	public void onScannedRobot(ScannedRobotEvent e) {
		fire(3);
                
        }
        
        public void onHitWall(HitWallEvent event){ 
            backDir *= -1;
            
  }
	public void onHitRobot(HitRobotEvent e) {
		if (e.getBearing() > -10 && e.getBearing() < 10) {
			fire(3);
		}
		if (e.isMyFault()) {
			turnRight(10);
		}
	}
}
    
