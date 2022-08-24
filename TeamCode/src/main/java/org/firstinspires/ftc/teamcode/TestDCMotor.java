package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class TestDCMotor extends LinearOpMode {
    DcMotorEx dcMotor;

//    public TestDCMotor(HardwareMap hardwareMap) {
//        dcMotor = hardwareMap.get(DcMotorEx.class, "dcMotorTest");
//    }

    public void runOpMode() {
        telemetry.addData("Controls", "A");
        telemetry.update();
        dcMotor = hardwareMap.get(DcMotorEx.class, "dcMotorTest");

        waitForStart();

        while (opModeIsActive()) {
            if (this.gamepad1.a) {
                dcMotor.setPower(0.5);
            }
            else {
                dcMotor.setPower(0);
            }
        }
    }
}
