// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

import frc.robot.subsystems.*;
import frc.robot.commands.*;
import static frc.robot.Constants.*;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a "declarative" paradigm, very little robot logic should
 * actually be handled in the {@link Robot} periodic methods (other than the
 * scheduler calls). Instead, the structure of the robot (including subsystems,
 * commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // JOYSTICK
  public final Joystick driver = new Joystick(DRIVER_CONTROLLER);
  public final Joystick operator = new Joystick(OPERATOR_CONTROLLER);

  // -- BUTTONS --
  public final JoystickButton pistonExtendButton = new JoystickButton(operator, BUTTON_X), 
    pistonRetractButton = new JoystickButton(operator, BUTTON_B);
  // SUBSYSTEMS
  public final Drivetrain DRIVETRAIN = new Drivetrain();
  public final PistonSystem PISTONSYSTEM = new PistonSystem();

  //Commands
  //private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    DRIVETRAIN.setDefaultCommand(
      new RunCommand(
        () -> DRIVETRAIN.tankDrive(-driver.getRawAxis(1), -driver.getRawAxis(3)),
        DRIVETRAIN
      )
    );
    pistonExtendButton.whenHeld(new PistonExtend(PISTONSYSTEM));
    pistonRetractButton.whenHeld(new PistonRetract(PISTONSYSTEM));

    

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  /*
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
  */
  }
}
