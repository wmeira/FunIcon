/*
Copyright (c) 2010, FunIcon Team
All rights reserved.

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

    * Redistributions of source code must retain the above copyright notice, this list
      of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright notice, this
      list of conditions and the following disclaimer in the documentation and/or
      other materials provided with the distribution.
    * Neither the name of Universidade Tecnológica Federal do Paraná nor the names of its
      contributors may be used to endorse or promote products derived from this software
      without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS
OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY
AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR
CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER
IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package armazenamento;

import java.io.File;
import java.io.FileFilter;

import auxiliar.Auxiliar;

/**
 * Classe representante de um filtro de arquivos por extensão.
 * @author Felipe Michels Fontoura
 */
public class FiltroFormato implements FileFilter {
    /**
     * Extensão associada a esse filtro.
     */
    private String extensao;

    /**
     * Cria um novo filtro a partir de uma extensão.
     * @param extensao Extensão a associar a esse filtro.
     */
    public FiltroFormato(String extensao) {
        this.extensao = extensao.toLowerCase();
    }

    @Override public boolean accept(File arquivo) {
        String teste = Auxiliar.obterExtensao(arquivo);
        if (teste != null) {
            return teste.equals(extensao);
        }
        return false;
    }
}