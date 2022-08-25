package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;
import com.qualcomm.robotcore.hardware.DigitalChannel;

@TeleOp(name="Tyler",group="TeleOp")
public class TylerCode extends LinearOpMode {
    Servo testServo;
    TouchSensor testTouchSensor;

    public void runOpMode() {
        testServo = hardwareMap.servo.get("servoTest");
        testTouchSensor = hardwareMap.touchSensor.get("touchSensor");

        waitForStart();


        while (opModeIsActive()) {
            if (testTouchSensor.isPressed()) {
                testServo.setPosition(0);
            } else {
                testServo.setPosition(1);
            }

            telemetry.addData("Touch sensor", testTouchSensor.isPressed());
            telemetry.update();
        }

    }


}