package com.qsp;

public class Chair {
    private String material_used;
    private boolean is_water_proof;

    public void setMaterial_used(String material_used) {
        this.material_used = material_used;
    }

    public void setIs_water_proof(boolean is_water_proof) {
        this.is_water_proof = is_water_proof;
    }

    public String getMaterial_used() {
        return material_used;
    }

    public boolean isIs_water_proof() {
        return is_water_proof;
    }
}
