package org.example;

import org.example.DataAccessObject.AppLogic;
import org.example.DataAccessObject.FakeClientDAO;
import org.example.GenericTypes.NonGenericSafe;

public class App
{
    public static void main( String[] args ) {
        FakeClientDAO dao = new FakeClientDAO();
        AppLogic app = new AppLogic(dao);
    }
}
