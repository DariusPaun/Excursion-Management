'use client'
import React from 'react';
import {
    Table,
    TableBody,
    TableCaption,
    TableCell,
    TableHead,
    TableHeader,
    TableRow,
} from "@/components/ui/table";

export default function StatisticsPeople() {
  // Set up state to hold the fetched data
  const [dataPeople, setDataPeople] = React.useState([]);

  // Fetch the data from the API
  React.useEffect(() => {
    fetch("http://localhost:9000/api")
      .then((res) => {
        if (!res.ok) {
          throw new Error(`HTTP error! Status: ${res.status}`);
        }
        return res.json();
      })
      .then((data) => {
        // Update state with the fetched data
        setDataPeople(data);
      })
      .catch((err) => console.error("Error fetching data:", err));
  }, []);

  const totalBaniCheltuiti = dataPeople.reduce(
    (total, person) => total + (person.Bani_cheltuiti || 0),
    0
  );

  return (
    <div className="overflow-x-auto p-4">
      <Table className="shadow-lg rounded-lg bg-gray-300">
        <TableCaption>People Statistics</TableCaption>
        <TableHeader>
          <TableRow className="bg-gray-800 text-white">
            <TableHead className="w-[100px] text-lg font-semibold">Name</TableHead>
            <TableHead className="text-lg font-semibold">Varsta</TableHead>
            <TableHead className="text-lg font-semibold">Sex</TableHead>
            <TableHead className="text-lg font-semibold">Numar excursii</TableHead>
            <TableHead className="text-lg font-semibold">Bani Cheltuiti</TableHead>
          </TableRow>
        </TableHeader>
        <TableBody>
          {/* Map through the dataPeople array and render each person's data in a table row */}
          {dataPeople.map((person, index) => (
            <TableRow
              key={index}
              className={`hover:bg-gray-200 transition-all duration-200 ${index % 2 === 0 ? 'bg-gray-300' : 'bg-gray-300'}`}
            >
              <TableCell className="font-medium">{person.Nume_Complet}</TableCell>
              <TableCell className="font-medium">{person.varsta}</TableCell>
              <TableCell className="font-medium">{person.SEX}</TableCell>
              <TableCell className="font-medium">{person.Nr_excursii}</TableCell>
              <TableCell className="font-medium">{person.Bani_cheltuiti}</TableCell>
            </TableRow>
          ))}
          <TableRow className="bg-gray-400">
            <TableCell className="font-bold">Total</TableCell>
            <TableCell></TableCell>
            <TableCell></TableCell>
            <TableCell></TableCell>
            <TableCell className="font-bold">{totalBaniCheltuiti}</TableCell>
          </TableRow>
        </TableBody>
      </Table>
    </div>
  );
}
