package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class TestServo extends LinearOpMode{
    private Servo testServo;

    public void runOpMode(){
        testServo = hardwareMap.get(Servo.class, "servoTest");
        telemetry.addData("Controls", "Use Controls A and B to turn servo" );
        telemetry.update();

        double position = 1;

        waitForStart();

        while(opModeIsActive()) {
            if (this.gamepad1.a) {
                testServo.setPosition(position);
            } else if (this.gamepad1.b) {
                testServo.setPosition(0);
            } else {
                testServo.setPosition(0.5);
            }
        }
    }
}



