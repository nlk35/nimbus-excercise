##Annotations

#Example 1
@ButtonGroup(cssClass="text-sm-right")
private FormGoalsButtonGroup formGoalsButtonGroup;

#Example 2
@TextBox(postEventOnChange = true)
@ConceptId(value = "IOT1.1.1")
@Label(value = "If Other, provide reason")
private String otherReason;

#Example 3
@AccessConditional(whenAuthorities="?[#this == 'entity_assign'].empty", p=Permission.HIDDEN)
private Section_EntityAssignment vsEntityAssignment;

##Components

#Example 1
@Radio(postEventOnChange = true, help="This field requires a value for pet type")
private String petType;

##Configurations

#Example 1
public static class VPHome {
 
@Section(Type.HEADER)
private VSHomeHeader vsHomeHeader;
 
@Section(Type.LEFTBAR)
private VSHomeLeftBar vsHomeLeftBar;
 
@Section(Type.FOOTER)
private VSHomeFooter vsHomeFooter;
 
    }
	
#Exanple 2
@Domain(value="Car", includeListeners={ListenerType.persistence})
@Repo(Database.rep_mongodb)
@Getter @Setter
public class CarEntity extends IdString {
 
    private String attr_String;
 
    private int attr_int;
    private Integer attr_Integer;
 
    private CarNestedEntity attr_CarNestedEntity;
 
    private List<CarNestedEntity> attr_list_2_CarNestedEntity;
 
    }
	
#Example 3

@Audit(SampleCarAuditEntry.class)
private String audit_String;
 
@Audit(SampleCarAuditEntry.class)
private Integer audit_Integer;
 
@Audit(SampleCarAuditEntry.class)
private String unmapped_String;
	
##UI Validations

#Example 1
@NotNull(message = "First name should not be empty.")
private String status;