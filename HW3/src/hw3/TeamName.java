/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw3;

/**
 *
 * @author moni_
 */
public enum TeamName {
    
   
    Innov8ors1 ("Innov8ors1"),
    Phoenix2("Phoenix2"),
    Zenith3("Zenith3"),
    LogicLegends4("LogicLegends4"),
    WebWhiz5("WebWhiz5"),
    CodeMasters6("CodeMasters6"),
    ByteForce7("ByteForce7"),
    CyberSprint8("CyberSprint8"),
    PixelPioneers9("PixelPioneers9"),
    HackHarbor10("HackHarbor10"),
    Algorithmia11("Algorithmia11"),
    TechTycoons12("TechTycoons12"),
    BitVanguards13("BitVanguards13"),
    InnovateIQ14("InnovateIQ14"),
    BitBenevolence15("BitBenevolence15"),
    CodeCatalysts16("CodeCatalysts16"),
    InfoSculptors17("InfoSculptors17"),
    DataDaredevils18("DataDaredevils18"),
    CodeCraftingArt19("CodeCraftingArt19"),
    WebWanderlust20("WebWanderlust20");

    private String displayName;

    private TeamName(String displayName) {
        this.displayName = displayName;
    }
    
     public String getDisplayName() {
        return displayName;
    }
    
}
