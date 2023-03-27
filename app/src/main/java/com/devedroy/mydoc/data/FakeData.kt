package com.devedroy.mydoc.data

import com.devedroy.mydoc.data.local.Department
import com.devedroy.mydoc.data.local.Hospital
import com.devedroy.mydoc.data.local.Surgery
import com.devedroy.mydoc.data.local.Test

fun fillHospitalData(): List<Hospital> {
    var hospitals  = mutableListOf(Hospital("Nizam's", "Hyderabad", 4.9f))
    for (i in 0..100) {
        hospitals.add(Hospital("Nizam's", "Hyderabad", 4.9f))
    }
    return hospitals
}



fun fillSurgeriesData(): List<Surgery> {
    var surgeries  = mutableListOf(Surgery("Heart Operation", 300000f))
    for (i in 0..100) {
        surgeries.add(Surgery("Heart Operation", 300000f))
    }
    return surgeries
}

fun fillDepartmentData(): List<Department> {
    var departments  = mutableListOf(Department("Dentist"))
    for (i in 0..100) {
        departments.add(Department("Dentist"))
    }
    return departments
}

fun fillTestData(): List<Test> {
    var tests  = mutableListOf(Test("PV/PF", 200f))
    for (i in 0..100) {
        tests.add(Test("PV/PF", 200f))
    }
    return tests
}