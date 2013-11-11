<%@page import="net.daw.helper.FilterBean"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.Iterator"%>
<%@page import="net.daw.bean.CompraBean"%>
<%@ page import="net.daw.helper.Contexto"%>
<%
    Contexto oContexto = (Contexto) request.getAttribute("contexto");
    ArrayList<Object> alObjetoParametro = (ArrayList<Object>) oContexto.getParametro();
    ArrayList<CompraBean> alPagina = (ArrayList<CompraBean>) alObjetoParametro.get(0);
    Iterator<CompraBean> oIterador = alPagina.listIterator();
%>
<div class="row-fluid">
    <div class="span8">
        <h1>Listado de compras</h1>
        <%
            if (!oIterador.hasNext()) {
                out.print("<h4>Listado vac�o</h4>");
            } else {
        %>
        <%
            if (oContexto.getHmOrder() != null) {
                out.print("<p>Listado ordenado por " + oContexto.getHmOrder().keySet().toArray()[0].toString() + "    ");
                out.print("<a href=\"Controller?" + oContexto.getSerializedParamsExceptOrder() + "\">(Quitar orden)</a></p>");
            } else {
                out.print("<p>Sin ordenar</p>");
            }
        %>
        <%
            if (oContexto.getAlFilter() != null) {
                out.print("<p>Listado filtrado: ");
                ArrayList<FilterBean> alFilter = oContexto.getAlFilter();
                Iterator iterator = alFilter.iterator();
                int bAddProductToClient = 0;
                while (iterator.hasNext()) {
                    FilterBean oFilterBean = (FilterBean) iterator.next();
                    out.print("(" + oFilterBean.getFilter() + " " + oFilterBean.getFilterOperator() + " " + oFilterBean.getFilterValue() + ") ");
                    if (oFilterBean.getFilter().equals("id_cliente") && oFilterBean.getFilterOperator().equals("equals")) {
                        bAddProductToClient = Integer.parseInt(oFilterBean.getFilterValue());
                    }
                }
                out.print("<a href=\"Controller?" + oContexto.getSerializedParamsExceptFilter() + "\">(Quitar filtro)</a></p>");
                if (bAddProductToClient>0) {
                    out.print("<a class=\"btn\" type=\"button\" href=\"Controller?searchingfor=cliente&class=compra&method=new&id_cliente=" + bAddProductToClient + "\">A�adir producto al cliente " + bAddProductToClient + "</a>");
                }
            } else {
                out.print("<p>Sin filtrar</p>");
            }
        %>         
        <%
            ArrayList<String> paginacion = (ArrayList<String>) alObjetoParametro.get(1);
            Iterator<String> iterador2 = paginacion.listIterator();
            while (iterador2.hasNext()) {
                String o = iterador2.next();
                out.print(o);
            }
        %>
    </div>
    <div class="span4">
        <div class="text-right">
            <legend>Filtro de producto</legend> 
            <form class="navbar-form pull-right" action="Controller" method="post" id="filterForm">
                <fieldset>                                               
                    <%=oContexto.getSerializedParamsExceptFilterFormFormat()%>       
                    <span>
                        <select id="filter" name="filter" width="80" style="width: 80px">
                            <option>id</option>
                            <option>id_cliente</option>
                            <option>id_producto</option>
                            <option>cantidad</option>
                            <option>fecha</option>                            
                        </select> 
                    </span>
                    <span>
                        <select id="filteroperator" name="filteroperator" width="80" style="width: 80px">
                            <option>like</option>
                            <option>notlike</option>
                            <option>equals</option>
                            <option>notequalto</option>
                            <option>less</option>
                            <option>lessorequal</option>
                            <option>greater</option>
                            <option>greaterorequal</option>                            
                        </select>            
                        <input id="filtervalue" name="filtervalue" type="search" size="20" maxlength="50" value=""  width="100" style="width: 100px"/>
                    </span>
                    <span>
                        <input type="submit" name="enviar" value="Filtrar" />
                    </span>
                </fieldset>
            </form>
        </div>
    </div>
</div>
<table class="table table-hover table-condensed">
    <tr>
        <th>id
            <a href="Controller?<%=oContexto.getSerializedParamsExceptOrder()%>&order=id&ordervalue=asc"><i class="icon-arrow-up"></i></a>
            <a href="Controller?<%=oContexto.getSerializedParamsExceptOrder()%>&order=id&ordervalue=desc"><i class="icon-arrow-down"></i></a>
        </th>
        <th>cliente
            <a href="Controller?<%=oContexto.getSerializedParamsExceptOrder()%>&order=id_cliente&ordervalue=asc"><i class="icon-arrow-up"></i></a>
            <a href="Controller?<%=oContexto.getSerializedParamsExceptOrder()%>&order=id_cliente&ordervalue=desc"><i class="icon-arrow-down"></i></a>
        </th>
        <th>producto
            <a href="Controller?<%=oContexto.getSerializedParamsExceptOrder()%>&order=id_producto&ordervalue=asc"><i class="icon-arrow-up"></i></a>
            <a href="Controller?<%=oContexto.getSerializedParamsExceptOrder()%>&order=id_producto&ordervalue=desc"><i class="icon-arrow-down"></i></a>
        </th>
        <th>cantidad
            <a href="Controller?<%=oContexto.getSerializedParamsExceptOrder()%>&order=cantidad&ordervalue=asc"><i class="icon-arrow-up"></i></a>
            <a href="Controller?<%=oContexto.getSerializedParamsExceptOrder()%>&order=cantidad&ordervalue=desc"><i class="icon-arrow-down"></i></a>        
        </th>
        <th>fecha
            <a href="Controller?<%=oContexto.getSerializedParamsExceptOrder()%>&order=fecha&ordervalue=asc"><i class="icon-arrow-up"></i></a>
            <a href="Controller?<%=oContexto.getSerializedParamsExceptOrder()%>&order=fecha&ordervalue=desc"><i class="icon-arrow-down"></i></a>         
        </th>
        <th>Operaciones</th>
    </tr>
    <%
        while (oIterador.hasNext()) {
            CompraBean oCompraBEAN = oIterador.next();
    %>
    <tr>
        <td><%=oCompraBEAN.getId()%></td>
        <td>
            <%=oCompraBEAN.getCliente().getNombre()%> <%=oCompraBEAN.getCliente().getApe1()%> (<%=oCompraBEAN.getCliente().getId()%>)
            <div class="btn-group">
                <a class="btn btn-mini" href="Controller?class=cliente&method=list&id=<%=oCompraBEAN.getId()%>&searchingfor=cliente&returnclass=compra&returnmethod=update&returnphase=2"><i class="icon-search"></i></a>                                        
            </div>            
        </td>
        <td>
            <%=oCompraBEAN.getProducto().getDescripcion()%> (<%=oCompraBEAN.getProducto().getId()%>)
            <div class="btn-group">
                <a class="btn btn-mini" href="Controller?class=producto&method=list&id=<%=oCompraBEAN.getId()%>&searchingfor=producto&returnclass=compra&returnmethod=update&returnphase=2"><i class="icon-search"></i></a>                                        
            </div>
        </td>
        <td><%=oCompraBEAN.getCantidad()%></td>
        <%
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        %>
        <td><%=formatoFecha.format(oCompraBEAN.getFecha())%></td>
        <td>
            <div class="btn-toolbar">
                <div class="btn-group">                    
                    <a class="btn btn-mini" href="Controller?class=compra&method=view&id=<%=oCompraBEAN.getId()%>"><i class="icon-eye-open"></i></a>
                    <a class="btn btn-mini" href="Controller?class=compra&method=update&id=<%=oCompraBEAN.getId()%>"><i class="icon-pencil"></i></a>           
                    <a class="btn btn-mini" href="Controller?class=compra&method=remove&id=<%=oCompraBEAN.getId()%>"><i class="icon-trash"></i></a>                         
                </div>
            </div>
        </td>
    </tr>
    <%
        }
    %>
</table>
<%
    }
%>
