package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.PistonSystem;

public class PistonRetract extends CommandBase {
    private PistonSystem Piston_system;

    public PistonRetract(PistonSystem Piston_system) {
        addRequirements(Piston_system);
        this.Piston_system = Piston_system;
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        Piston_system.allPistonsOff();
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {}

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {}

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
