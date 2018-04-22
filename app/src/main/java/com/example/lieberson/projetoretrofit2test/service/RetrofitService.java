package com.example.lieberson.projetoretrofit2test.service;

import com.example.lieberson.projetoretrofit2test.model.RespostaServidor;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * @author lieberson
 *
 * */

public interface RetrofitService{

    @Headers("X-Mashape-Key: AuuyclCPjcmshv2iOPq190OpzLrMp1FJWwejsnJrdfwOUr4h44")   //Para a API do exemplo funcionar é necessário colocar uma chave obrigatória do site Mashape

    @FormUrlEncoded
    @POST("convert")                                                                //@POST é instanciado o tipo da requisição http. O termo “convert” refere-se ao final da URL base. Logo, toda vez que for chamado este endpoint ele irá juntar a URL base junto com o final dela, dando o acesso exato ao endpoint
    Call<RespostaServidor> converterUnidade(@Field("from-type") String from_type,
                                            @Field("from-value") String from_value,
                                            @Field("to-type") String to_type);
}
