package com.example.model;
 
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
 
@Data
@Builder
public class LombokModel2
{
    private @NonNull String name;
    private @NonNull String age;
    private @NonNull String address;
 
    public static void main(String[] args)
    {
        LombokModel2 lombokModel = new LombokModel2Builder()
                                    .name("Sajal")
                                    .address("India")
                                    .age("100")
                                    .build();
     
        System.out.println(lombokModel);   
    }
}   