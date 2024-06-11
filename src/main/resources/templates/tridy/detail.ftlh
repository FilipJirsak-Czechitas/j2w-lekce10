[#ftl]

[@c.page title="Třída ${trida.nazev}"]
    <h1>Třída ${trida.nazev}</h1>
    <p>Třídní učitel: ${trida.tridniUcitel.celeJmeno}</p>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Příjmení</th>
            <th scope="col">Jméno</th>
            <th scope="col"></th>
        </tr>
        </thead>
        <tbody>
        [#list trida.studenti as student]
            <tr>
                <td>${student.prijmeni}</td>
                <td>${student.jmeno}</td>
                <td><a href="/student/${student.id}">Detail</a></td>
            </tr>
        [/#list]
        </tbody>
    </table>
[/@c.page]
