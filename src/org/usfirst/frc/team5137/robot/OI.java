package org.usfirst.frc.team5137.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team5137.robot.commands.*;

import edu.wpi.first.wpilibj.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	public Joystick driveStick;
	public Joystick driveStick2;
	public Joystick launchpad;
	public JoystickButton raiseScissorLift;
	public JoystickButton lowerScissorLift;
	public JoystickButton intake;
	public JoystickButton shoot;
	public JoystickButton raiseShooter;
	public JoystickButton lowerShooter;
	public JoystickButton rollupWinch;
	public JoystickButton unrollWinch;
	public JoystickButton pullUp;
	
	public OI() {
		driveStick = new Joystick(0);
		driveStick2 = new Joystick(1);
		launchpad = new Joystick(2);
		raiseScissorLift = new JoystickButton(driveStick, 6);
		raiseScissorLift.whileHeld(new RaiseScissorLift());
		lowerScissorLift = new JoystickButton(driveStick, 5);
		lowerScissorLift.whileHeld(new LowerScissorLift());
		intake = new JoystickButton(driveStick2, 1);
		intake.whileHeld(new Intake());
		shoot = new JoystickButton(driveStick, 1);
		shoot.whenPressed(new AimAndShoot());
		raiseShooter = new JoystickButton(driveStick2, 3);
		raiseShooter.whileHeld(new RaiseShooter());
		lowerShooter = new JoystickButton(driveStick2, 2);
		lowerShooter.whileHeld(new LowerShooter());
		rollupWinch = new JoystickButton(launchpad, 8);
		rollupWinch.whileHeld(new RollupWinch());
		unrollWinch = new JoystickButton(launchpad, 9);
		unrollWinch.whileHeld(new UnrollWinch());
		pullUp = new JoystickButton(launchpad, 13);
		pullUp.whileHeld(new PullUp());
		}
	
	public Joystick getDriveStick() {
		return driveStick;
	}
}

