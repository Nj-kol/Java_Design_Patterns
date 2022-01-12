package com.njkol.designpatterrns.behavioural.interpreter;

import java.util.List;

class From implements Expression {

    private String table;
    private Where where;

    public From(String table) {
        this.table = table;
    }

    public From(String table, Where where) {
        this.table = table;
        this.where = where;
    }

    @Override
    public List<String> interpret(Context ctx) {
        ctx.setTable(table);
        if (where == null) {
            return ctx.search();
        }
        return where.interpret(ctx);
    }
}