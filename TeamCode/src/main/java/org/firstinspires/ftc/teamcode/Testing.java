package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class Testing extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        Servo servoTest = hardwareMap.servo.get("Servo");
        Servo servotest1 = hardwareMap.servo.get("servo");
        waitForStart();

        if (isStopRequested()) return;

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            // check to see if we need to move the servo.
                servotest1.setPosition(gamepad1.left_stick_y);
                // move to 0 degrees.
                servoTest.setPosition(gamepad1.left_stick_x);
            telemetry.addData("Servo Position", servoTest.getPosition());
            telemetry.addData("Status", "Running");
            telemetry.update();

        }

    }
}

