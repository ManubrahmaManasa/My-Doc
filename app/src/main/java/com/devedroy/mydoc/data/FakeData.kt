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



fun fillSurgeriesData(): List<Surgery> = listOf(
    Surgery("Heart Operation", 300000f)
)

fun fillDepartmentData(): List<Department> = listOf(
    Department("Dentist")
)

fun fillTestData(): List<Test> = listOf(
    Test("PV/PF", 200f)
)