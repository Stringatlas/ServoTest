package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class Motors extends LinearOpMode {
    private Servo testServo;
    DcMotorEx dcMotor;

    public void runOpMode(){
        testServo = hardwareMap.get(Servo.class, "servoTest");
        dcMotor = hardwareMap.get(DcMotorEx.class, "dcMotorTest");

        telemetry.addData("Controls", "Use Controls left stick y to turn servo\n" +
                "Use left stick x to turn DC Motor");

        telemetry.update();

        waitForStart();

        while(opModeIsActive()) {
            if (this.gamepad1.a) {
                dcMotor.setPower(this.gamepad1.left_stick_x);
            }
            else {
                dcMotor.setPower(0);
            }

            if (this.gamepad1.b) {
                testServo.setPosition((gamepad1.left_stick_y + 1.0) / 2.0);
            }

            telemetry.addData("Motor Power; ", dcMotor.getPower());
            telemetry.addData("Servo position: ", testServo.getPosition());
            telemetry.update();
        }
    }
}
