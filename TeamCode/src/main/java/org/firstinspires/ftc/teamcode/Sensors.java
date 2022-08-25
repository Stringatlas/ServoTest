//package org.firstinspires.ftc.teamcode;
//
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.TouchSensor;
//
//
//@TeleOp
//public class Sensors extends LinearOpMode{
//    TouchSensor touchSensor;
//
////    @Override
////    public void init() {
////        hardwareMap.get(TouchSensor.class, "touchSensor");
////
////    }
//
//
//
//
//    public void runOpMode(){
//        while (opModeIsActive()) {
//            if (this.gamepad1.a) {
//                dcMotor.setPower(this.gamepad1.left_stick_x);
//            }
//            else {
//                dcMotor.setPower(0);
//            }
//        }
//
//        telemetry.addData("a", this.gamepad1.left_stick_x);
//        telemetry.update();
//    }
//}
//
//
//
