package ru.intelligency.scholarship.domain.myapplications

import kotlinx.coroutines.flow.Flow
import ru.intelligency.scholarship.domain.myapplications.models.Application
import ru.intelligency.scholarship.domain.myapplications.models.ApplicationWithDocuments

interface ApplicationsRepository {

    fun getApplications(): Flow<List<Application>>

    fun getApplicationById(applicationId: Long): Flow<ApplicationWithDocuments?>

    suspend fun createApplication(application: Application)

    suspend fun updateApplication(application: Application)

    suspend fun deleteApplication(applicationId: Long)
}
