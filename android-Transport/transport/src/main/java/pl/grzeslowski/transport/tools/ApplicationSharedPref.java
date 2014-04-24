package pl.grzeslowski.transport.tools;

import org.androidannotations.annotations.sharedpreferences.SharedPref;

@SharedPref
public interface ApplicationSharedPref {

    String lastFrom();

    String lastTo();
}
