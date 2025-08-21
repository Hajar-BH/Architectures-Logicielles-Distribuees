
package web.service.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rechercheDisponibilites complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rechercheDisponibilites"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateArrivee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateDepart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nbPersonnes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="prixMax" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rechercheDisponibilites", propOrder = {
    "dateArrivee",
    "dateDepart",
    "nbPersonnes",
    "prixMax"
})
public class RechercheDisponibilites {

    protected String dateArrivee;
    protected String dateDepart;
    protected int nbPersonnes;
    protected double prixMax;

    /**
     * Gets the value of the dateArrivee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateArrivee() {
        return dateArrivee;
    }

    /**
     * Sets the value of the dateArrivee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateArrivee(String value) {
        this.dateArrivee = value;
    }

    /**
     * Gets the value of the dateDepart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateDepart() {
        return dateDepart;
    }

    /**
     * Sets the value of the dateDepart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateDepart(String value) {
        this.dateDepart = value;
    }

    /**
     * Gets the value of the nbPersonnes property.
     * 
     */
    public int getNbPersonnes() {
        return nbPersonnes;
    }

    /**
     * Sets the value of the nbPersonnes property.
     * 
     */
    public void setNbPersonnes(int value) {
        this.nbPersonnes = value;
    }

    /**
     * Gets the value of the prixMax property.
     * 
     */
    public double getPrixMax() {
        return prixMax;
    }

    /**
     * Sets the value of the prixMax property.
     * 
     */
    public void setPrixMax(double value) {
        this.prixMax = value;
    }

}
