package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.PistonSystem;


public class PistonExtend extends CommandBase {
    private PistonSystem Piston_system;

    public PistonExtend(PistonSystem Piston_system) {
        addRequirements(Piston_system);
        this.Piston_system = Piston_system;
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        try {
            Piston_system.activatePistons();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
