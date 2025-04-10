/*

In LJ Innovation 2024, We have number of projects and from
it we selected project “SmartHub” for incubation center.
Their idea is to make smart home automation devices
and sell out to the end users.
For this they require a Java Software so Student,
please help them to automate their smart home using Java.
All the best for it.
Requirements:
Device Interface : This defines behavior of all devices.

Methods are :
-void turnOn(): turns the device on ,
-void turnoﬀ(): turns the device oﬀ ,
-boolean getStatus() : returns the status of device whether it is on/oﬀ

Abstract class : HomeAutomation
This provide functionality to manage the devices.
-abstract void addDevice(Device device): Adds a new device to the
 system.
-abstract void removeDevice(Device device): Removes a device from the system.
-abstract void checkDeviceStatus(Device device) throws DeviceNotFoundException:
 Checks the status of a specific device.
-Create DeviceNotFoundExcepƟon : If user enters the device which is not
 there then it throws DeviceNotFoundException() [This is unchecked exception]
-abstract void turnOﬀAllDevices(): Turns oﬀ all devices in the system.

 Light class implements Device:
Methods:
-void turnOn() : Turns the light On
-void turnOﬀ() : Turns the light Oﬀ
-boolean getStatus(): Returns the current status of the light

SecurityCamera class  implements Device:
Methods:
-void turnOn() : AcƟvates the Security Camera
-void turnOﬀ() : DeacƟvates the Security Camera
-boolean getStatus(): Returns the current status of the Security Camera

Class SmartHub
This class contains the main() method and extends the HomeAutomation class.
Implement all abstract methods of HomeAutomation class over here in SmartHub class.
Create a method handleUserChoice(int choice) : that throws InvaildChoiceException
This is must be a checked exception.
Ask user to do the following again and again until user enters 8 :
-Choice 1 : to Add Light
-Choice 2 : to Add SecurityCamera
-Choice 3 : To turn Light On [If it is oﬀ ] / Oﬀ [If it is On]
-Choice 4 :  To turn Security Camera AcƟvate [If it is DeacƟvate] / Deactivate[If it is Activate]
-Chocie 5 : To Check Status of Light : Throw DeviceNotFoundExcepƟon if Light is not added in Home
-Choice 6: TO Check Status of SecurityCamera :  Throw DeviceNotFoundException & Handle it if
 SecurityCamera is not added in Home
-Choice 7 : To TurnOﬀAll Devices
-Choice 8 : To Come out from the Choices
-If user enter < 1 && >8 then throw InvalidChoiceExcepƟon & Handle it -At Last use
 ﬁnally to print Thank you for choosing Smart Hub

*/


import java.util.Scanner;

// consider this as SmartHub class;
public class Program112 extends HomeAutomation {

    static Device[] devices = new Device[10];

    public static void main(String[] args) {

        Program112 smartHub = new Program112();


        Scanner sc = new Scanner(System.in);

        System.out.println("1. Add Light");
        System.out.println("2. Add SecurityCamera");
        System.out.println("3. Turn Light On/Off");
        System.out.println("4. Turn Security Camera Activate/Deactivate");
        System.out.println("5. Check Status of Light");
        System.out.println("6. Check Status of SecurityCamera");
        System.out.println("7. Turn Off All Devices");
        System.out.println("8. Exit");



        try {

            int ch;

            do{

                System.out.println("Enter your choice");
                ch = sc.nextInt();
                handleUserChoice(ch);

                switch (ch){
                    case 1: {
                        smartHub.addDevice(new Light());
                        System.out.println("Added a new light");
                        break;
                    }
                    case 2:{
                        smartHub.addDevice(new SecurityCamera());
                        System.out.println("Added a new security camera");
                        break;
                    }

                    // this toggles all lights
                    case 3:{

                        for (Device device : devices){

                            if (device instanceof Light) {

                                if (device.getStatus())
                                    device.turnOff();
                                else
                                    device.turnOn();

                            }

                        }
                        System.out.println("Toggled all lights");

                        break;
                    }

                    // this toggles all security cameras
                    case 4:{

                        for (Device device : devices){

                            if (device instanceof SecurityCamera) {

                                if (device.getStatus())
                                    device.turnOff();
                                else
                                    device.turnOn();

                            }
                            System.out.println("Toggled all cameras");

                        }

                        break;
                    }

                    case 5: {

                        for(Device device : devices){
                            if(device instanceof Light)
                                smartHub.checkDeviceStatus(device);
                        }

                        break;
                    }
                    case 6: {
                        for(Device device : devices){
                            if(device instanceof SecurityCamera)
                                smartHub.checkDeviceStatus(device);
                        }

                        break;
                    }
                    case 7: {
                        smartHub.turnOffAllDevices();
                        System.out.println("Turned off all devices");
                        break;
                    }
                    case 8: {
                        System.out.println("Exiting...");
                        return;
                    }
                    default: {
                        System.out.println("Invalid choice");
                    }
                }

            }
            while(ch != 8);

        }
        catch (InvalidChoiceException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Thank you for choosing Smart Hub");
        }

    }

    void addDevice(Device device) {
        for (int i = 0; i < devices.length; i++) {
            if (devices[i] == null) {
                devices[i] = device;
                break;
            }
        }
    }

    void removeDevice(Device device) {
        for (int i = 0; i < devices.length; i++) {
            if (devices[i] == device) {
                devices[i] = null;
                break;
            }
        }
    }

    void checkDeviceStatus(Device device) throws DeviceNotFoundException {
        for (Device d : devices) {
            if (d == device) {
                System.out.println(d.getStatus());
                return;
            }
        }
        throw new DeviceNotFoundException();

    }

    void turnOffAllDevices() {

        for (Device device : devices)
            if(device != null)
                device.turnOff();
    }

    static void handleUserChoice(int choice) throws InvalidChoiceException {

        if(choice < 1 || choice > 8){
            throw new InvalidChoiceException();
        }

    }
}



interface Device{

    void turnOn();

    void turnOff();

    boolean getStatus();

}

abstract class HomeAutomation{

    abstract void addDevice(Device device);

    abstract void removeDevice(Device device);

    abstract void checkDeviceStatus(Device device) throws DeviceNotFoundException;

    abstract void turnOffAllDevices();

}


class Light implements Device{

    boolean isOn = false;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean getStatus() {
        return isOn;
    }

}

class SecurityCamera implements Device{

    boolean isActivated = false;

    public void turnOn() {
        isActivated = true;
    }

    public void turnOff() {
        isActivated = false;
    }

    public boolean getStatus() {
        return isActivated;
    }
}

class DeviceNotFoundException extends RuntimeException{
    DeviceNotFoundException(){
        super("Device not found");
    }
}

class InvalidChoiceException extends RuntimeException{
    InvalidChoiceException(){
        super("Invalid choice");
    }
}