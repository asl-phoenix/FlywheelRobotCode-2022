package frc.robot.subsystems;
 
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.*;
 
import com.ctre.phoenix.ErrorCode;
import com.ctre.phoenix.sensors.PigeonIMU;
import com.ctre.phoenix.sensors.PigeonIMU.CalibrationMode;
 
/**
 * COMPETITION READY
 * 
 * Two motors in a gearbox (winch) to lift us, and one motor to initally raise
 * the arm.
 */
public class PistonSystem extends SubsystemBase {
 
    private DoubleSolenoid basePiston;
    private DoubleSolenoid topPiston; 
 
    public PistonSystem() {
        DoubleSolenoid basePiston = new DoubleSolenoid(BASE_PISTON_PORT_1, BASE_PISTON_PORT_2);
        DoubleSolenoid topPiston = new DoubleSolenoid (TOP_PISTON_PORT_1, TOP_PISTON_PORT_2);
    }
 
    public void deployBasePiston() {
        basePiston.set(DoubleSolenoid.Value.kForward);
      }
 
    public void deployTopPiston() {
        topPiston.set(DoubleSolenoid.Value.kForward);
      }
 
    public void activatePistons() throws InterruptedException
    {
        basePiston.set(DoubleSolenoid.Value.kForward);
        Thread.sleep(1000l);
        topPiston.set(DoubleSolenoid.Value.kForward);
    }
 
 
 
    public void retractBasePiston()
    {
        basePiston.set(DoubleSolenoid.Value.kReverse);
    }
 
    public void retractTopPiston()
    {
        topPiston.set(DoubleSolenoid.Value.kReverse);
    }
 
    public void basepistonOff()
    {
        basePiston.set(DoubleSolenoid.Value.kOff);
    }
 
    public void topPistonOff()
    {
        topPiston.set(DoubleSolenoid.Value.kOff);
    }
 
    public void allPistonsOff()
    {
        basePiston.set(DoubleSolenoid.Value.kOff);
        topPiston.set(DoubleSolenoid.Value.kOff);
    }
 
    @Override
    public void periodic() {
        // This method will be called once per scheduler run
 
    }
 
}