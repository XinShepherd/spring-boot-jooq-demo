/*
 * This file is generated by jOOQ.
 */
package io.github.xinshepherd.jooq.generated.tables.records;


import io.github.xinshepherd.jooq.generated.tables.City;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CityRecord extends UpdatableRecordImpl<CityRecord> implements Record5<Integer, String, String, String, Integer> {

    private static final long serialVersionUID = -1271344034;

    /**
     * Setter for <code>world.city.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>world.city.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>world.city.Name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>world.city.Name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>world.city.CountryCode</code>.
     */
    public void setCountrycode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>world.city.CountryCode</code>.
     */
    public String getCountrycode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>world.city.District</code>.
     */
    public void setDistrict(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>world.city.District</code>.
     */
    public String getDistrict() {
        return (String) get(3);
    }

    /**
     * Setter for <code>world.city.Population</code>.
     */
    public void setPopulation(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>world.city.Population</code>.
     */
    public Integer getPopulation() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, String, String, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, String, String, String, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return City.CITY.ID;
    }

    @Override
    public Field<String> field2() {
        return City.CITY.NAME;
    }

    @Override
    public Field<String> field3() {
        return City.CITY.COUNTRYCODE;
    }

    @Override
    public Field<String> field4() {
        return City.CITY.DISTRICT;
    }

    @Override
    public Field<Integer> field5() {
        return City.CITY.POPULATION;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getCountrycode();
    }

    @Override
    public String component4() {
        return getDistrict();
    }

    @Override
    public Integer component5() {
        return getPopulation();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getCountrycode();
    }

    @Override
    public String value4() {
        return getDistrict();
    }

    @Override
    public Integer value5() {
        return getPopulation();
    }

    @Override
    public CityRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public CityRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public CityRecord value3(String value) {
        setCountrycode(value);
        return this;
    }

    @Override
    public CityRecord value4(String value) {
        setDistrict(value);
        return this;
    }

    @Override
    public CityRecord value5(Integer value) {
        setPopulation(value);
        return this;
    }

    @Override
    public CityRecord values(Integer value1, String value2, String value3, String value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CityRecord
     */
    public CityRecord() {
        super(City.CITY);
    }

    /**
     * Create a detached, initialised CityRecord
     */
    public CityRecord(Integer id, String name, String countrycode, String district, Integer population) {
        super(City.CITY);

        set(0, id);
        set(1, name);
        set(2, countrycode);
        set(3, district);
        set(4, population);
    }
}
