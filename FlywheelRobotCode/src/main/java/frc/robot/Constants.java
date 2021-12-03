// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    //Piston Ports
    public static final int BASE_PISTON_PORT_1 = 2;
    public static final int BASE_PISTON_PORT_2 = BASE_PISTON_PORT_1 + 1;

    public static final int TOP_PISTON_PORT_1 = 0;
    public static final int TOP_PISTON_PORT_2 = TOP_PISTON_PORT_1 + 1;
    
    public static final int DRIVER_CONTROLLER = 0;
    public static final int OPERATOR_CONTROLLER = 1;

    //Sticks for Xbox controller
    public static final int HORIZ_AXIS_LEFT = 0;
    public static final int FORWARD_AXIS_LEFT = 1;
    public static final int HORIZ_AXIS_RIGHT = 4;
    public static final int FORWARD_AXIS_RIGHT = 5;

    //Buttons for Xbox controller
    public static final int BUTTON_A = 1;
    public static final int BUTTON_B = 2;
    public static final int BUTTON_X = 3;
    public static final int BUTTON_Y = 4;
    public static final int LEFT_BUMPER = 5;
    public static final int RIGHT_BUMPER = 6;
    public static final int BACK_BUTTON = 7;
    public static final int START_BUTTON = 8;
    public static final int LEFT_STICK_BUTTON = 9;
    public static final int RIGHT_STICK_BUTTON = 10;
}
