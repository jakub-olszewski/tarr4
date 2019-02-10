package pl.sdacademy.tarr4.projekty.listStudents.views;

import pl.sdacademy.tarr4.projekty.listStudents.data.Data;

/**
 * View
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 10.02.2019 15:02
 **/
public abstract class View {

    protected Data getData() {
        return data;
    }

    private Data data;

    public View(Data data) {
        this.data = data;
        build();
    }

    // modyfikator dostępu
    // protected
    protected abstract void build();
}
