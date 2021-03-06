package hainguyen.impala.injection.module;

import android.content.Context;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hainguyen.impala.application.ApplicationBus;
import hainguyen.impala.application.ImpalaApplication;
import hainguyen.impala.injection.helper.ScopeHelper;
import hainguyen.impala.injection.helper.ScopeHelperImpl;
import hainguyen.impala.util.ContactUtil;
import hainguyen.impala.util.ContactUtilImpl;

@Singleton
@Module
public class AppModule {

    private final ImpalaApplication application;

    public AppModule(ImpalaApplication impalaApplication) {
        application = impalaApplication;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return this.application;
    }

    @Provides
    @Singleton
    Gson provideGson() {
        return new Gson();
    }

    @Provides
    @Singleton
    ContactUtil provideContactUtil() {
        return new ContactUtilImpl();
    }

    @Provides
    @Singleton
    ApplicationBus provideApplicationBus() {
        return new ApplicationBus();
    }

    @Provides
    @Singleton
    ScopeHelper provideScopeHelper() {
        return new ScopeHelperImpl();
    }
}
