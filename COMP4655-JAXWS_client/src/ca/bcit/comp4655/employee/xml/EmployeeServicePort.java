
package ca.bcit.comp4655.employee.xml;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import ca.bcit.comp4655.employee.types.Employee;
import ca.bcit.comp4655.employee.types.ObjectFactory;
import ca.bcit.comp4655.employee.types.ResponseCode;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EmployeeServicePort", targetNamespace = "http://www.bcit.ca/comp4655/employee/xml")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmployeeServicePort {


    /**
     * 
     * @return
     *     returns java.util.List<ca.bcit.comp4655.employee.types.Employee>
     * @throws EmployeeServerException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEmployeeList", targetNamespace = "http://www.bcit.ca/comp4655/employee/types/", className = "ca.bcit.comp4655.employee.types.GetEmployeeList")
    @ResponseWrapper(localName = "getEmployeeListResponse", targetNamespace = "http://www.bcit.ca/comp4655/employee/types/", className = "ca.bcit.comp4655.employee.types.GetEmployeeListResponse")
    @Action(input = "http://www.bcit.ca/comp4655/employee/xml/EmployeeServicePort/getEmployeeListRequest", output = "http://www.bcit.ca/comp4655/employee/xml/EmployeeServicePort/getEmployeeListResponse", fault = {
        @FaultAction(className = EmployeeServerException.class, value = "http://www.bcit.ca/comp4655/employee/xml/EmployeeServicePort/getEmployeeList/Fault/EmployeeServerException")
    })
    public List<Employee> getEmployeeList()
        throws EmployeeServerException
    ;

    /**
     * 
     * @param employeeId
     * @return
     *     returns ca.bcit.comp4655.employee.types.Employee
     * @throws EmployeeServerException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findEmployeeById", targetNamespace = "http://www.bcit.ca/comp4655/employee/types/", className = "ca.bcit.comp4655.employee.types.FindEmployeeById")
    @ResponseWrapper(localName = "findEmployeeByIdResponse", targetNamespace = "http://www.bcit.ca/comp4655/employee/types/", className = "ca.bcit.comp4655.employee.types.FindEmployeeByIdResponse")
    @Action(input = "http://www.bcit.ca/comp4655/employee/xml/EmployeeServicePort/findEmployeeByIdRequest", output = "http://www.bcit.ca/comp4655/employee/xml/EmployeeServicePort/findEmployeeByIdResponse", fault = {
        @FaultAction(className = EmployeeServerException.class, value = "http://www.bcit.ca/comp4655/employee/xml/EmployeeServicePort/findEmployeeById/Fault/EmployeeServerException")
    })
    public Employee findEmployeeById(
        @WebParam(name = "employeeId", targetNamespace = "")
        String employeeId)
        throws EmployeeServerException
    ;

    /**
     * 
     * @param employeeId
     * @return
     *     returns ca.bcit.comp4655.employee.types.ResponseCode
     * @throws EmployeeServerException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "removeEmployee", targetNamespace = "http://www.bcit.ca/comp4655/employee/types/", className = "ca.bcit.comp4655.employee.types.RemoveEmployee")
    @ResponseWrapper(localName = "removeEmployeeResponse", targetNamespace = "http://www.bcit.ca/comp4655/employee/types/", className = "ca.bcit.comp4655.employee.types.RemoveEmployeeResponse")
    @Action(input = "http://www.bcit.ca/comp4655/employee/xml/EmployeeServicePort/removeEmployeeRequest", output = "http://www.bcit.ca/comp4655/employee/xml/EmployeeServicePort/removeEmployeeResponse", fault = {
        @FaultAction(className = EmployeeServerException.class, value = "http://www.bcit.ca/comp4655/employee/xml/EmployeeServicePort/removeEmployee/Fault/EmployeeServerException")
    })
    public ResponseCode removeEmployee(
        @WebParam(name = "employeeId", targetNamespace = "")
        String employeeId)
        throws EmployeeServerException
    ;

    /**
     * 
     * @param employee
     * @return
     *     returns ca.bcit.comp4655.employee.types.ResponseCode
     * @throws EmployeeServerException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addEmployee", targetNamespace = "http://www.bcit.ca/comp4655/employee/types/", className = "ca.bcit.comp4655.employee.types.AddEmployee")
    @ResponseWrapper(localName = "addEmployeeResponse", targetNamespace = "http://www.bcit.ca/comp4655/employee/types/", className = "ca.bcit.comp4655.employee.types.AddEmployeeResponse")
    @Action(input = "http://www.bcit.ca/comp4655/employee/xml/EmployeeServicePort/addEmployeeRequest", output = "http://www.bcit.ca/comp4655/employee/xml/EmployeeServicePort/addEmployeeResponse", fault = {
        @FaultAction(className = EmployeeServerException.class, value = "http://www.bcit.ca/comp4655/employee/xml/EmployeeServicePort/addEmployee/Fault/EmployeeServerException")
    })
    public ResponseCode addEmployee(
        @WebParam(name = "employee", targetNamespace = "")
        Employee employee)
        throws EmployeeServerException
    ;

}