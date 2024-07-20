package com.example.fooddelivery.di

import android.content.Context
import com.example.fooddelivery.database.manager.LocalUserManagerImp
import com.example.fooddelivery.domain.manager.LocalUserManager
import com.example.fooddelivery.domain.usecase.app_entry_usecase.ReadAppEntry
import com.example.fooddelivery.domain.usecase.app_entry_usecase.SaveAppEntry
import com.example.fooddelivery.domain.usecase.app_entry_usecase.all_use_case.AppEntryUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Singleton
    @Provides
    fun provideLocalManager(@ApplicationContext context: Context):LocalUserManager{

        return LocalUserManagerImp(context)

    }

    @Singleton
    @Provides
    fun provideAppEntryUseCase(localUserManager: LocalUserManager):AppEntryUseCases{

        return AppEntryUseCases(SaveAppEntry(localUserManager), ReadAppEntry(localUserManager))

    }



}